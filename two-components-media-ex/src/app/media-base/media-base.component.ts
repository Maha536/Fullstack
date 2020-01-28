import { Component, OnInit } from '@angular/core';
import { Mediafile } from '../models/media.model';

@Component({
  selector: 'app-media-base',
  templateUrl: './media-base.component.html',
  styleUrls: ['./media-base.component.css']
})
export class MediaBaseComponent implements OnInit {
  files : Array <Mediafile>;

  constructor() { 
    this.files = [
      
    ]
   }

   saveMedia(fname:HTMLInputElement,ftitle:HTMLInputElement,fdescription:HTMLInputElement,ftags:HTMLInputElement):void{
    let file = new Mediafile(fname.value,ftitle.value,fdescription.value,ftags.value);
    this.files.push(file);
    //resetting
    fname.value='';
    ftitle.value='';
    fdescription.value='';
    ftags.value='';
  }

  ngOnInit() {
  }

}
