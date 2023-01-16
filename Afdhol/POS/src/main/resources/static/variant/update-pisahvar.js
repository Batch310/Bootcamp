function getAllCategoriesApi(){
		return $.ajax ({
			
			url : "/api/category/get",
			method : "GET",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}


function editVariantApi(variantDTO){
		return $.ajax ({
			
			url : "/api/variant/update",
			method : "PUT",
			data : variantDTO,
			contentType : "application/json",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	function bukaPopupEdit(initial,name,category_id,category_name,active,id){
		//console.log(editVariantApi);
		console.log("edit clicked") //menampilkan di console
		console.log(id+" "+category_id+" "+initial+" "+name+" "+active+" "+category_name);
		
		
		var varResponse = getAllCategoriesApi().responseJSON.data;
		console.log(varResponse);
		var html = "";
		
		for(i=0; i<varResponse.length; i++){
			//console.log(catResponse[i]);
			html += `<option value = ${varResponse[i].id}>${varResponse[i].name}</option>`
		}
		
		//Ganti title
		$(".modal-title").html("Edit")
		
		//Mengisi modal body
		$(".modal-body").html(
		`
		<table class = "table table-borderless">
			
			<tr>
				<td>Category</td>
				<td>
				
				<select id ="input-category" class = "form-control">
				<option value = "$(category_id)" selected hidden> ${category_name}</option>
					${html}
				</select>
				
				
				</td>
			</tr>
			
			<tr>
			
						
			<tr>
				<td>Initial</td>
				<td>
					<input id="input-initial" class = "form-control" value="${initial}">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input id="input-name" class = "form-control" value="${name}">
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<input id="input-active" type ="checkbox" ${active == true ? 'checked' : ''}> <!--jika checkbox true dicek, else '' -->
				</td>
			</tr>
			<tr>
				<td>
				</td>
				<td>
					<button id = "input-cancel" class="btn btn-light">Cancel</button>
					<button id = "input-save" class="btn btn-warning">Save Changes</button>
				</td>
			</tr>
			
			
		</table>
		
		
		`);
		
		$("#input-cancel").click(function(){
			$(".modal").modal("hide");
		});
		
		$("#input-save").click(function(){
			
			var category = $("#input-category").val();
			console.log(category);
			
			
			//ambil initial
			var initial = $("#input-initial").val();
			console.log(initial);
			
			//ambil name
			var name = $("#input-name").val();
			console.log(name);
			
			//ambil active
			var active = $("#input-active").prop("checked")
			console.log(active);
			
			//create by
			var modifyBy = "yuhan";
			console.log(modifyBy);
			
			//Proses Ubah JSON
			var variantDTO = JSON.stringify({
				"category_id" : category,
				"initial" : initial,
				"name" : name,
				"active" : active,
				"modify_by" : modifyBy,
				"id" : id
			});
			console.log(variantDTO);
			//Panggil API Insert
			
			var response = editVariantApi(variantDTO).responseJSON;
			if(response.code == 200){
				alert(response.message);
				$(".modal").modal("hide");
				refreshList();
				
			}else{
				alert(response.message);
			}
			
			
		});
		
		
		
		//$ adalah pengenal
		// . adalah class
		// # adalah id
		$(".modal").modal("show");
	}
	