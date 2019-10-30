export class Author
{

authors:any[];


constructor()
{

this.authors=[
{authorId:1,authorName:'raj',authorGender:'male',authorStatus:'married'},
{authorId:2,authorName:'rajeev',authorGender:'male',authorStatus:'unmarried'},
{authorId:3,authorName:'rajeshwari',authorGender:'female',authorStatus:'unmarried'},
{authorId:4,authorName:'rajni',authorGender:'female',authorStatus:'married'}
]

}

getAuthors()
{
    return this.authors;
}

}

