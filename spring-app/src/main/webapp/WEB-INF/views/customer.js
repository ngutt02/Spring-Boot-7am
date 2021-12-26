/*$(document).ready(function() {*/
    $.ajax({
        url: "http://localhost:4343/Bookapi/books/all"
        method:GET,
        success:function(data1)
        {
        	 console.log("response:"+ data);
        	
        	
        	
        	/*function(data1) {
                console.log("response:" + data1);
            },*/
        	
        	
        	
        	
        	
        }
        error:function(jqXHR, textStatus, errorThrown){
            console.log(' Error in processing! '+textStatus);

       
        } 
    });/*.then(function(data) {
       $('Bookapi/books/all-bookId').append(data.bookId);
       $('.Bookapi/books/all-name').append(data.name);
       $('.Bookapi/books/all-price').append(data.price);
    });*/
/*});*/