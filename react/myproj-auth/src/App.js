import { Route, BrowserRouter as Router, Switch, Link } from "react-router-dom";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Login from "./components/Login";
import Error from "./components/Error";

function App() {
  return (
    <Router>
      <li>
        <Link to="/">Login</Link>
      </li>
      <li>
        <Link to="/dashboard">Dashboard</Link>
      </li>
      <Switch>
          <Route path="/" exact component={Login}></Route>
          <Route path="/login" exact component={Login}></Route>
          <Route path="/dashboard" exact component={Dashboard}></Route>
          <Route path="/error/:type" exact component={Error}></Route>
        </Switch>
    </Router>
  );
}

export default App;
