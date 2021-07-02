class MyLogger {
    static debug(val){
        console.log(new Date + "," + val);
    }
}


MyLogger.debug("Print This");
