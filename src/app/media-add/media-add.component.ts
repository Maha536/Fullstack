import { Component, OnInit } from '@angular/core';
import { MediafilesService } from '../service/mediafiles.service';
import { Router } from '@angular/router';
import { Mediafile } from '../models/media.model';

@Component({
  selector: 'app-media-add',
  templateUrl: './media-add.component.html',
  styleUrls: ['./media-add.component.css']
})
export class MediaAddComponent implements OnInit {

  constructor(public mediaService : MediafilesService,public router : Router) { }
  saveMedia(txtid:HTMLInputElement,txtname:HTMLInputElement, txttitle:HTMLInputElement,txtdescription:HTMLInputElement, txttags:HTMLInputElement){
    
    let media = new Mediafile(parseInt(txtid.value),txtname.value, txttitle.value,txtdescription.value, txttags.value)
    
    this.mediaService.addMedia(media).subscribe((responce:any)=>this.router.navigate(['/media/']));
  }

  ngOnInit() {
  }

}
