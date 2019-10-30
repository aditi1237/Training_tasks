import { PipeTransform, Pipe } from '@angular/core';

@Pipe({name:"gender"})
export class GenderPipe implements PipeTransform
{
    transform(value: string, gender:string, status:string) {
    
        if(gender.toUpperCase()=="MALE")
        {
            return "MR "+value;
        }
        else
        {
            if(status == "unmarried"){
            return "MISS "+value;}
            else{
            return "MRS "+value;}
        }

    }

    
}
