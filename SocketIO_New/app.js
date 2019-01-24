const express = require('express');
const fileIO = require("fs");
const app = express();
const httpServer = require('http').Server(app);
const socketIO = require('socket.io');
const serverSocket = socketIO(httpServer);

serverSocket.on('connection', function(socket){
    console.log('User Connected..');
});

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

// Update data every 1 second and emit data
setInterval(function(){
    data += 1;
    serverSocket.emit('data', data);
},  1000);

httpServer.listen(8082);



