import {Pipe, PipeTransform} from "@angular/core";
@Pipe({name: 'removequotes',pure: false})
export class RemoveQuotes implements PipeTransform {
    transform(value: string): string {
        let result = "";
        if (value)
            result = value.replace(/"/g, "");

        return result;
    }
}