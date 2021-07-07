import logo from "./logo.svg";
import "./App.css";
import About from "./Components/About";
import Contact from "./Components/Contact";
import Home from "./Components/Home";
import { Route, BrowserRouter as Router, Switch, Link } from "react-router-dom";
import Secure from "./Components/Secure";
import PrivateRoute from "./Components/_utility/PrivateRoute";
import Login from "./Components/Login";
import Secure2 from "./Components/Secure2";

function App() {
  const isAuthenticated = false;

  const links = [
    { id: 3, menu: "/secure", desc: "Secured-Page1" },
    { id: 3, menu: "/secure2", desc: "Secured-Page2" }
  ];

  return (
    <Router>
      <div className="App">
        {isAuthenticated &&
          links.map((x) => {
            return (
              <li>
                <Link key={x.id} to={x.menu}>{x.desc}</Link>
              </li>
            );
          })}
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/about">About</Link>
        </li>
        <li>
          <Link to="/contact">Contact Us</Link>
        </li>
        <Switch>
          <Route path="/" exact component={Home}></Route>
          <Route path="/about" exact component={About}></Route>
          <Route path="/contact" exact component={Contact}></Route>
          <Route path="/home" exact component={Home}></Route>
          <Route path="/login" exact component={Login}></Route>
          <PrivateRoute exact path="/secure" flag={isAuthenticated} component={Secure} />
          <PrivateRoute exact path="/secure2" flag={isAuthenticated} component={Secure2} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
