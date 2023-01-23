function insertCategoriesApi(categoryDTO){
		return $.ajax ({
			
			url : "/api/category/insert",
			method : "POST",
			data : categoryDTO,
			contentType : "application/json",
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	
		
	function bukaPopupAdd(){
		console.log("add category clicked") //menampilkan di console
		
		//Ganti title
		$(".modal-title").html("Add Category")
		
		//Mengisi modal body
		$(".modal-body").html(
		`
		<table class = "table table-borderless">
			<tr>
				<td>Initial</td>
				<td>
					<input id = "input-initial" class = "form-control">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					<input id = "input-name" class = "form-control">
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<input id="input-active" type ="checkbox"">
				</td>
			</tr>
			<tr>
				<td>
				
				</td>
				<td>
					<button id ="input-cancel"  class="btn btn-light">Cancel</button>
					<button id = "input-create" class="btn btn-success">Create</button>
				</td>
			</tr>
			
			
		</table>
		
		
		`);
		
		$("#input-cancel").click(function(){
			$(".modal").modal("hide");
		});
		
		$("#input-create").click(function(){
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
			var createBy = "yuhan";
			console.log(createBy);
			
			//Proses Ubah JSON
			var categoryDTO = JSON.stringify({
				"initial" : initial,
				"name" : name,
				"active" : active,
				"create_by" : createBy
			});
			
			//Panggil API Insert
			
			var response = insertCategoriesApi(categoryDTO).responseJSON;
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
	