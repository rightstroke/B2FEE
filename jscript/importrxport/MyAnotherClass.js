export default class MyStringClass {
  constructor(x) {
    this.title = x;
  }

  concat(x){
      return this.title + "," + x;
  }
}
