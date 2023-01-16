//--------------------------------------------------DELETE-------------------------		

		function bukaPopupDelete(category, initial, name, active) {
			console.log("Delete Variant Clicked")
			console.log(category + " " + initial + " " + name + " " + active)

			//Ganti title
			$(".modal-title").html("Delete");

			//isi modal body
			$(".modal-body").html(
				`
			<h5>Are you sure want to delete this ?</h5>
			<table class="table table-borderless">
			<tr>
				<td>Category</td>
				<td>
					${category}
				</td>
			<tr>
				<td>Initial</td>
				<td>
					${initial}
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>
					${name}
				</td>
			</tr>
			<tr>
				<td>Active</td>
				<td><input type="checkbox" disabled checked></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button class="btn btn-light">Cancel</button>
					<button class="btn btn-danger">Delete</button>
				</td>
			</tr>
			</table>
			`
			);

			//. class
			//# id
			$(".modal").modal("show");
		}
