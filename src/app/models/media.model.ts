export class Mediafile{
    id : number;
    Name : String;
    Title : String;
    Description : String;
    Tags : String;

    constructor(id : number,name : String,title : String,description : String,tags:String){
        this.id = id;
        this.Name=name;
        this.Title=title;
        this.Description=description;
        this.Tags=tags;
    }
}