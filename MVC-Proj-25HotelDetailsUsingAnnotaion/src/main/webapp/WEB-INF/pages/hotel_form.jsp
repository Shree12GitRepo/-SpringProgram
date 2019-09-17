<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <form action="insrtHTDT.htm" method="get">
    	<table>
    		<tr>
    			<th>Hotel Details Insertions</th>
    		</tr>
    		<tr>
    			<td>Enter Hotel Name</td>
    			<td><input type="text" name="name"></td>
    		</tr>
    		<tr>
    			<td>Select State</td>
    			<td>
    				<select name="state">
    					<option>----Select State---</option>
    					<option value="Odisha">Odisha</option>
    					<option value="MP">MP</option>
    					<option value="Telengana">Telengana</option>
    					<option value="AP">AP</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>Select City</td>
    			<td>
    				<select name="city">
    					<option>----Select State---</option>
    					<option value="BBSR">Bhubaneswar</option>
    					<option value="MP">MP</option>
    					<option value="Amerpet">Amerpet</option>
    					<option value="AP">AP</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>Couple Friendly</td>
    			<td>
    				Yes<input type="radio" name="couplefrndly" checked="checked" value="yes">
    				No<input type="radio" name="couplefrndly" value="No">
    			</td>
    		</tr>
    		<tr>
    			<td>Type</td>
    			<td>
    				2*<input type="radio" name="type" value="2star" >
    				3*<input type="radio" name="type" checked="checked" value="3star">
    				4*<input type="radio" name="type" value="4star">
    				5*<input type="radio" name="type" value="5star">
    			</td>
    		</tr>
    		<tr>
    			<td rowspan="2"><input type="submit" value="Submit"></td>
    		</tr>
    	</table>
    </form>