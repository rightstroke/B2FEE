import React,{useState,useCallback} from 'react'

export default function UseArrayFn(initialState) {
    const [data,setData] = useState(initialState);

    return {
        data,
        setData,
        add: useCallback((a) => setData((v)=>[...v,a])),
        clear:useCallback(() => setData(()=>[])),
        removeIndex:useCallback((index) =>
            setData((v)=>{
                return v.filter((x,i)=> i != index);
            })
        )
    };
}
