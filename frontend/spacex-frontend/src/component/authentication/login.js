import { React, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./login.css";

function Login() {
  const [isValid, setIsValid] = useState(true);
  let navigate = useNavigate();
  const handelClick = () => {
    setIsValid(current => !current);
    if (isValid) {
      navigate('/members/avp');
    }
  }
  return (
    <div >
    <div class="outerDiv">
      <div class="box">
        <h3 class="heading">LOGIN</h3>

        <form class="form-style">
          <div class="form-group">
            <label for="empId">Employee ID</label>
            <input type="string" class="form-control" id="empId" aria-describedby="empId" placeholder="Enter Employee ID" />
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password" />
          </div>
          <div class="btn-style">
          <button class="btn btn-dark" type="submit" onClick={handelClick}>Login</button>
          </div>
          <div class="container signin">
            <p>Don't have an account? <a href="/register">Sign Up</a>.</p>
          </div>
        </form>
      </div>
    </div>
    </div>

  );
}

export default Login;