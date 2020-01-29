import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {
  searchData : String;

  constructor(public route : ActivatedRoute) {
    this.route.params.subscribe((x) =>this.searchData = x["searchText"]) ;

   }

  ngOnInit() {
  }

}
