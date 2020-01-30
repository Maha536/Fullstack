import { Component, OnInit } from '@angular/core';
import { MediafilesService } from '../service/mediafiles.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Mediafile } from '../models/media.model';

@Component({
  selector: 'app-media-update',
  templateUrl: './media-update.component.html',
  styleUrls: ['./media-update.component.css']
})
export class MediaUpdateComponent implements OnInit {
  id :number;
  media : Mediafile;
  constructor(public mediaService:MediafilesService,public router:Router,public route:ActivatedRoute) {
    this.route.params.subscribe((x) =>this.id = x["mediaId"])
   }

  updateMedia(txtid:HTMLInputElement,txtname:HTMLInputElement, txttitle:HTMLInputElement,txtdescription:HTMLInputElement, txttags:HTMLInputElement){
    console.log("inside update Media")
    let mediafile1 = new Mediafile(this.id,txtname.value,txttitle.value,txtdescription.value,txttags.value);
    this.mediaService.update(this.id,mediafile1).subscribe((responce)=>this.router.navigate(['/media/']));
  }
  ngOnInit() {
    this.mediaService.getMedia(this.id).subscribe((responce:any)=>{this.media=responce});
  }

}
