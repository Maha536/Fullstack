import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mediafile } from '../models/media.model';

const API_URL ="http://localhost:3000/media";
@Injectable({
  providedIn: 'root'
})
export class MediafilesService {

  constructor(public http : HttpClient) { 

  }

  getAllMedia(){
    return this.http.get(API_URL);
  }
  getMedia(id:number){
    return this.http.get(API_URL+"/"+id);
  }
  addMedia(media:Mediafile){
    return this.http.post(API_URL,media);
  }
  delete(id:number){
    return this.http.delete(API_URL+"/"+id);
  }
  update(id:number,media:Mediafile){
    return this.http.put(API_URL+"/"+id,media);
  }
}
