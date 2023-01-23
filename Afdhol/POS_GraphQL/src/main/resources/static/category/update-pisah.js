function editCategoryApi(categoryDTO){
		return $.ajax ({
			
			url : "/api/category/update",
			method : "PUT",
			data : categoryDTO,
			contentType : "application/json",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	function bukaPopupEdit(initial,name,active,id){
		console.log("edit clicked") //menampilkan di console
		console.log(initial+" "+name+" "+active+" "+id)
		
		//Ganti title
		$(".modal-title").html("Edit")
		
		//Mengisi modal body
		$(".modal-body").html(
		`
		<table class = "table table-borderless">
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
			var categoryDTO = JSON.stringify({
				"initial" : initial,
				"name" : name,
				"active" : active,
				"modify_by" : modifyBy,
				"id" : id
			});
			console.log(categoryDTO);
			//Panggil API Insert
			
			var response = editCategoryApi(categoryDTO).responseJSON;
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
	