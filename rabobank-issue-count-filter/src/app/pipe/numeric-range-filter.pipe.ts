import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'numericRangeFilter',
    pure:false
})
export class NumericRangeFilterPipe implements PipeTransform {

    transform(list:any, minNum: number | undefined, maxNum:number | undefined) {
        let filter_list = list;
        if (minNum) {
            filter_list = filter_list.filter(_item => {
                return _item.issueCount >= +minNum;
            });
        }

        if (maxNum) {
            filter_list = filter_list.filter(_item => {
                return _item.issueCount <= +maxNum;
            });
        }
        return  filter_list;
    }

}