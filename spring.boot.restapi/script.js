// api url
const api_url = 
      "http://localhost:8081/api/getdata";
  
// Defining async function
async function getapi(url) {
    
    // Storing response
    const response = await fetch(url);
    
    // Storing data in form of JSON
    var data = await response.json();
    console.log(data);
    if (response) {
        hideloader();
    }
    show(data);
}
// Calling that async function
getapi(api_url);
  
// Function to hide the loader
function hideloader() {
    document.getElementById('loading').style.display = 'none';
}
// Function to define innerHTML for HTML table
function show(data) {
    let tab = 
        `<tr>
          <th>Id</th>
          <th>Account_Number</th>
          <th>Account_Name</th>
          <th>Bank_Id</th>
          <th>Bank_Name</th>
          <th>Transaction_Id</th>
          <th>Amount</th>
          <th>Receiver_Account_Number</th>
          <th>Receiver_Account_Name</th>
          <th>Status</th>
          <th>Date</th>
         </tr>`;
    
    // Loop to access all rows 
    for ( let r of data) {
        tab += `<tr> 
    <td>${r.id} </td>
    <td>${r.account_Number}</td>
    <td>${r.account_Name}</td> 
    <td>${r.bank_Id}</td>   
    <td>${r.bank_Name} </td>
    <td>${r.transaction_Id} </td>       
    <td>${r.amount} </td>
    <td>${r.receiver_Account_Number} </td>
    <td>${r.receiver_Account_Name} </td>
    <td>${r.status} </td>
    <td>${r.date} </td>  
</tr>`;
    }
    // Setting innerHTML as tab variable
    document.getElementById("td").innerHTML = tab;
}