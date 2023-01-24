function resetTransaction(){
			$(".content-body").html(`
				<tr>
					<td>Total</td>
					<td></td>
					<td><input id="total-quantity" value="3" disabled></td>
					<td><input id="total-price" value="26000" disabled></td>
					<td>Remove</td>
				</tr>
			`)
			recalculate();
		}