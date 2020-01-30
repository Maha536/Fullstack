import { Component, OnInit } from '@angular/core';
import { MediafilesService } from 'src/app/service/mediafiles.service';
import { Mediafile } from 'src/app/models/media.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-media-base',
  templateUrl: './media-base.component.html',
  styleUrls: ['./media-base.component.css']
})
export class MediaBaseComponent implements OnInit {
  mediafiles : Array<Mediafile>;
  constructor(public mediaSource : MediafilesService,public router : Router) { }

  deleteMedia(id : number){
    this.mediaSource.delete(id).subscribe((responce:any)=>this.mediaSource.getAllMedia().subscribe((responce:any)=>{this.mediafiles=responce}))

  }

  updateMedia(id : number){
    this.router.navigate(['/media-update/'+id]);

  }

  ngOnInit() {
    this.mediaSource.getAllMedia().subscribe((responce:any)=>{this.mediafiles=responce});

  }

}
