import logo from './logo.svg';
import './App.css';
import MyClassComponents from './components/MyClassComponents';
import REact,{useState} from 'react';
import MyFuntionaComponent from './components/MyFuntionaComponent';


function App() {
  
  const [color,setColor] = useState("Red");
  const [toggle,setToggle] = useState(false);

  const handleColorChange = (e)=> {
    console.log("===================" + new Date());
    setColor(e.target.value);
  }

  const handleToggle = () =>{
    setToggle((p)=>{
      return !p;
    })
  }

  return (
    <div className="App">
      
      <input type="text" value={color} onChange={handleColorChange} />
       
      {!toggle && <MyFuntionaComponent color={color}/> }
      {toggle && <MyClassComponents color={color}/> }
      {color} - {toggle}

      <button onClick={handleToggle}>Toggle</button>
    </div>
  );
}

export default App;
