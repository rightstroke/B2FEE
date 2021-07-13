import React, { useState } from "react";

export default function MyDivideForm() {
  var [numerator, setNumerator] = useState("");
  var [denominator, setDenominator] = useState("");
  var [executionOutput, setExecutionOutput] = useState("");
  var [errorMessage, setErrorMessage] = useState(false);
  var [hasError, setHasError] = useState(false);

  const updateValue = (e) => {
    const { name, value, id } = e.target;
    if (id === "numerator") {
      setNumerator(value);
    } else {
      setDenominator(value);
    }
  };

  const getDivision = () => {
    try {
      if (denominator === "0") {
        setHasError(true);
        setErrorMessage("Divide By Zero Exception!!");
        throw Error(errorMessage);
      }

      setExecutionOutput(numerator / denominator);
    } catch(e) {
        console.error("Error has occured" + e);
    }
  };

  return (
    <div>
      <div>
        <label>Numerator</label>
        <input
          id="numerator"
          name="numerator"
          type="text"
          value={numerator}
          onChange={updateValue}
        />
      </div>
      <div>
        <label>Denomenator</label>
        <input
          id="denomenator"
          name="denomenator"
          type="text"
          value={denominator}
          onChange={updateValue}
        />
      </div>
      <h3>The result output is - {executionOutput}</h3>

      {hasError && <div>{errorMessage}</div>}
      <input type="button" onClick={getDivision} value="Divide Values" />
    </div>
  );
}
