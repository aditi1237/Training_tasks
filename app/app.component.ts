import { Component } from '@angular/core';
import { Author } from './Author.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  authors:any[]
  author=new Author();

constructor()
{

  this.authors=this.author.getAuthors();
}

}
