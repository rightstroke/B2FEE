import React, { useState, useEffect } from "react";
import SessionStorageIncrement from "./_custhooks/SessionStorageIncrement";

export default function MyNewCounter() {
  const [count, setCounter] = useState(() => {
    let val;
    try {
      val = JSON.parse(
        window.localStorage.getItem("my-app-new-counter") || "0"
      );
      console.log(val);
    } catch (e) {
      val = 0;
    }
    return val;
  });

  const [a,setA] = SessionStorageIncrement("my-new-key2",0);

  const handleIncrementCounter = () => {
    setCounter((prev) => prev + 1);
    setA((prev) => prev + 1);
  };

  useEffect(() => {
    window.localStorage.setItem("my-app-new-counter", count);
    document.title = `The Counter is..${count}`;
  }, [count]);

  return (
    <div>
      <button onClick={handleIncrementCounter}>{count}</button>
    </div>
  );
}
