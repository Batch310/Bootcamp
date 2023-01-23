function hapusVariantApi(variantId){
		var formData = new FormData();
		formData.append("id",variantId);
		
		return $.ajax ({
			
			url : "/api/variant/delete",
			method : "DELETE",
			contentType : false,
			processData : false,
			mimeType : "multipart/form-data",
			data : formData,
			async : false  //agar berjalan tidak pararel kemana mana
		});
	}
	
	
	function bukaPopupHapus(category_name,initial,name,active,id){
		console.log("hapus clicked") //menampilkan di console
		console.log("id"+" "+id)
		//Ganti title
		$(".modal-title").html("Delete")
		
		//Mengisi modal body
		$(".modal-body").html(
		`
		<h5> Are you sure want to delete this?</h5>
		<table class = "table table-borderless">
		<tr>
				<td >Category</td>
				<td >
					${category_name}
				</td>
			</tr>
			<tr>
				<td >Initial</td>
				<td >
					${initial}
				</td>
			</tr>
			<tr>
				<td >Name</td>
				<td>
					${name}
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<input type ="checkbox" disabled ${active == true ? 'checked' : ''}>
			</tr>
			<tr>
				<td>
				</td>
				<td>
					<button id = "input-cancel" class="btn btn-light">Cancel</button>
					<button id = "input-delete" class="btn btn-danger">Delete</button>
				</td>
			</tr>
			
			
		</table>
		
		
		`);
		
		$("#input-cancel").click(function(){
			$(".modal").modal("hide");
		});
		
		$("#input-delete").click(function(){
			//ambil responeText
			var response = hapusVariantApi(id).responseText;
			console.log(response);
			
			//Convert ke JSON
			var responseJson = $.parseJSON(response);
			
			if(responseJson.code == 200){
				alert(responseJson.message);
				$(".modal").modal("hide");
				refreshList();
				
			}else{
				alert(responseJson.message);
			}
			
		});
		
		
		//$ adalah pengenal
		// . adalah class
		// # adalah id
		$(".modal").modal("show");
	}