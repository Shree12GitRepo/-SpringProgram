/**
 * Validation For Form page..
 * Having patient Name,Address,Doctorname,registration date . 
 */
function validate(){
	alert("Form Submission start")
	/*Read the Form Data..*/
	let patientName=document.frm.pname.value;
	console.log("Patient Name "+patientName);
	let padd=document.frm.padd.value;
	let disease=document.frm.disease.value;
	let doctors=document.frm.doctors.value;
	let regeistrationdate=document.frm.regeistrationdate.value;

	//if(patientName == "" || patientName==null)
	if(patientName == "")
	{
		alert("patientName")
		document.getElementsByClassName('error').innerHTML="Name Must not be blank";
		//focus the Text box
		patientName.focus();
		return false;
	}
	//if(padd == ""|| padd==null)
	if(padd == "")
	{
		alert("padd");
		document.getElementsByClassName('error').innerHTML="Address Must not be empty";
		//focus the Text box
		padd.focus();
		return false;
	}
	else if(padd.length<=0 || padd.length>=50)
	{
		document.getElementsByClassName('error').innerHTML="Address must not be < 0 or >50";
		//focus the Text box
		padd.focus();
		return false;
	}
	//if(disease == "" || disease==null)
	if(disease == "")
	{
		document.getElementsByClassName('error').innerHTML="Mandatory to Place Disease";
		//focus the Text box
		disease.focus();
		return false;
	}
	//if(doctors == "" || doctors==null)
	if(doctors == "")
	{
		document.getElementsByClassName('error').innerHTML="PLZ ADD Required Field";
		//focus the Text box
		doctors.focus();
		return false;
	}
	
	//if(regeistrationdate == "" || regeistrationdate==null)
	if(regeistrationdate == "")
	{
		document.getElementsByClassName('error').innerHTML="PLZ ADD Required Field";
		//focus the Text box
		regeistrationdate.focus();
		return false;
	}
	return true;
	
}
