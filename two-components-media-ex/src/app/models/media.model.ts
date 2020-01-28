export class Mediafile{
    Name : String;
    Title : String;
    Description : String;
    Tags : String;

    constructor(name : String,title : String,description : String,tags:String){
        this.Name=name;
        this.Title=title;
        this.Description=description;
        this.Tags=tags;
    }
}