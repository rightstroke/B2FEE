import logo from './logo.svg';
import './App.css';
import MyDivideForm from './Components/MyDivideForm';
import ErrorBoundary from './Components/ErrorBoundary';
import UnStableCounter from './Components/UnStableCounter';
import UnStableCounter2 from './Components/UnStableCounter2';
import MyNewCounter from './Components/MyNewCounter';
import MyAnotherNewComponent from './Components/MyAnotherNewComponent';
import MyCustomerNames from './Components/MyCustomerNames';

function App() {
  return (
    <div className="App">
      {/* <MyDivideForm/>  */}

      {/* <ErrorBoundary>
        <UnStableCounter/>
        <hr/>
        <UnStableCounter2/>
      </ErrorBoundary> */}

     

      {/* <MyAnotherNewComponent/>
      <hr/>
      <MyNewCounter/>  */}

      <MyCustomerNames/>
    </div>
  );
}

export default App;
