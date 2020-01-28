import { Component, OnInit, Input } from '@angular/core';
import { Mediafile } from '../models/media.model';

@Component({
  selector: 'app-media-list',
  templateUrl: './media-list.component.html',
  styleUrls: ['./media-list.component.css']
})
export class MediaListComponent implements OnInit {
  @Input()
  filesList : Array<Mediafile>;

  constructor() { }

  ngOnInit() {
  }

}
