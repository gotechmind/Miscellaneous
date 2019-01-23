const express = require('express');
const fileIO = require("fs");
const app = express();
let htmlPage = "";
/*
Read index.html from server and send to browser whenever localhost:8080/ url is hit
*/
fileIO.readFile("./index.html", function(err, htmlPage) {
    app.get("/", function(request, response){
        response.contentType("text/html");
        response.send(htmlPage);
        response.end();
    });
});

let data = 0;
/*
Read latest data from server and send to browser whenever localhost:8080/data url is hit
*/
app.get("/data", function(request, response){
    response.send(""+data);
    response.end();
});

// Update data every 1 second
setInterval(function(){
    data += 1;
    console.log(data);
},  1000);

app.listen(8082);



