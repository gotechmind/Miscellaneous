import { Component, OnInit } from '@angular/core';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  fields : Object;


  constructor(private data : DataService) {

  }

  ngOnInit() {
    this.data.getFields().subscribe(
      data => {
        this.fields = data;
        console.log(this.fields);
      }
    );
  }

/*  getValuesForField(field) {
    if(!field.links[0]) {
      return;
    }    
    console.log("Get field link ::" + field.links[0].href);
    this.data.getValuesForField(field.links[0].href).subscribe(
      data => {
        this.fieldValues = data;
        console.log(this.fieldValues);
      }
    );
  }*/
 }
