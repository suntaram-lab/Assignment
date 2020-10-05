import { Injectable }       from '@angular/core';
import {CSVModel} from "../model/csv-model";

@Injectable()
export class FileUtil {

    constructor() {}

    isCSVFile(file) {
        return file.name.endsWith(".csv");
    }

    getHeaderArray(csvRecordsArr, tokenDelimeter) {        
        let headers = csvRecordsArr[0].split(tokenDelimeter);
        let headerArray = [];
        for (let j = 0; j < headers.length; j++) {
            headerArray.push(headers[j]);
        }
        return headerArray;
    }

    validateHeaders(origHeaders, fileHeaaders) {
        if (origHeaders.length != fileHeaaders.length) {
            return false;
        }

        var fileHeaderMatchFlag = true;
        for (let j = 0; j < origHeaders.length; j++) {
            if (origHeaders[j] != fileHeaaders[j]) {
                fileHeaderMatchFlag = false;
                break;
            }
        }
        return fileHeaderMatchFlag;
    }

    getDataRecordsArrayFromCSVFile(csvRecordsArray, headerLength, 
        validateHeaderAndRecordLengthFlag, tokenDelimeter) {
        var dataArr = []

        var csvDataArr:CSVModel[] = [];

        for (let i = 1; i < csvRecordsArray.length; i++) {
            let data = csvRecordsArray[i].split(tokenDelimeter);
            
            if(validateHeaderAndRecordLengthFlag && data.length != headerLength){
                if(data==""){
                    alert("Extra blank line is present at line number "+i+", please remove it.");
                    return null;
                }else{
                    alert("Record at line number "+i+" contain "+data.length+" tokens, and is not matching with header length of :"+headerLength);
                    return null;
                }
            }

            let col = [];
            for (let j = 0; j < data.length; j++) {
                col.push(data[j]);
            }
            csvDataArr.push({
                firstName:data[0],
                lastName: data[1],
                issueCount: data[2],
                dateOfBirth: data[3]
            });
            dataArr.push(col);
        }
        console.log(JSON.stringify(csvDataArr));
        return csvDataArr;
    }

}