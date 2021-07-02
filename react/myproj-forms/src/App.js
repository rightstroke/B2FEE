import logo from './logo.svg';
import './App.css';
import UserRegistration from './Components/UserRegistration';
import MyNewValidations from './Components/MyNewValidations';

function App() {


  const handleUserAddition = (e) =>{
    console.log("I am from App.js");
    console.log(e);
  }

  return (
    <div className="App">
      <UserRegistration onUserAdd={handleUserAddition}/>
      {/* <MyNewValidations/> */}
    </div>
  );
}

export default App;
