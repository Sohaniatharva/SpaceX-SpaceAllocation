import { React, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./login.css";

function Login() {
  const [isValid, setIsValid] = useState(true);
  const [formData, setFormData] = useState({
    empId: "",
    password: ""
  });
  let navigate = useNavigate();
  const handelClick = () => {
    setIsValid(current => !current);
    
    if (isValid) {
      navigate('/members/avp/', {state:formData});
    }
  }
  const handleChange = (e) => {

    setFormData({ ...formData, [e.target.name]: e.target.value })
   
  }
  const handleSubmit = (e) => {
    e.preventDefault();
    handelClick();
  }
  return (
    <div >
      <div class="outerDiv">
        <div class="box">
          <h3 class="heading">LOGIN</h3>

          <form class="form-style" onSubmit={handleSubmit}>
            <div class="form-group">
              <label for="empId">Employee ID</label>
              <input type="string" class="form-control" name="empId" id="empId" value={formData.empId} aria-describedby="empId" placeholder="Enter Employee ID" onChange={handleChange} />
            </div>
            <div class="form-group">
              <label for="password">Password</label>
              <input type="password" class="form-control" name="password" id="password" value={formData.password} placeholder="Password" onChange={handleChange} />
            </div>
            <div class="btn-style">
              <button class="btn btn-dark" type="submit" >
             Login
                </button>
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