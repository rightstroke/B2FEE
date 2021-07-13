import React from 'react'
import SessionStorageIncrement from './_custhooks/SessionStorageIncrement';

export default function MyAnotherNewComponent() {

    const [count, setCounter] = SessionStorageIncrement("my-new-key",0);

    const handleIncrementCounter = () => {
        setCounter((prev) => prev + 1);
      };


    return (
        <div>
            <button onClick={handleIncrementCounter}>{count}</button>
        </div>
    )
}
