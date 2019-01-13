import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-combobox',
  templateUrl: './combobox.component.html',
  styleUrls: ['./combobox.component.css'],
  inputs:['field']
})
export class ComboboxComponent implements OnInit {
  field : Object

  fieldValues : Object
 
  constructor(private data : DataService) { }

  ngOnInit() {
   // this.fieldValues = ["1","2","3"];
    console.log("select box initialized" + this.fieldValues);
    this.getValuesForField(this.field);
  }
  
  getValuesForField(field) {
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
  }

}
