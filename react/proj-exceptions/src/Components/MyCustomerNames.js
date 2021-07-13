import React from "react";
import UseArrayFn from "./_custhooks/UseArrayFn";

export default function MyCustomerNames() {
  const custs = UseArrayFn(["Cust1","Cust2","Cust3"]);

  const handleCustomerAdd = () => {
    console.log("Adding Customer....");
    custs.add("Cust".concat(Math.random()));
  };

  const handleCustomerReset = () => {
    console.log("Clearing Customer....");
    custs.clear();
  };

  return (
    <div>
      <ul>
        {custs.data.map((val, idx) => {
          return (<li key={idx}>
              {val}
              <button className="btn btn-info" onClick={() => custs.removeIndex(idx)}>delete</button>
              </li>);
        })}
      </ul>
      <button className="btn btn-warning" onClick={handleCustomerAdd}>Add Customer</button>
      <button className="btn btn-danger" onClick={handleCustomerReset}>Reset</button>
    </div>
  );
}
