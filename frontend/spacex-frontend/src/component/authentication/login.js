import { React, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./login.css";
import { useEffect } from "react";
import axios from 'axios';
function Login() {
  
  const [isValid, setIsValid] = useState(true);
  const [formData, setFormData] = useState(0);
  const [id,setId]=useState(null);
  let navigate = useNavigate();
  const handelClick = (dis) => {
    console.log(dis);
    setIsValid(current => !current);
    if(formData==0)
    {
        alert('Please Enter EmpId.')
    }
    else {
      if(dis=='VP')
      {
      navigate('/members/vp/', {state:formData});
      }
    }
  }

  const handleChange = (e) => {

    setFormData({ ...formData, [e.target.name]: e.target.value })
    setId(e.target.value)
   
  }
  const handleSubmit = (e) => {

    e.preventDefault();
    axios.get(` http://localhost:9091/spaceX/allocateSpace/{empId}?empId=${id} `).then((res)=>{
 
      handelClick(res.data.designation);
      
     
       
      }) 

   
  }


  return (
    <div >
      <div class="outerDiv">
        <div class="box">
          <h3 class="heading">LOGIN</h3>

          <form class="form-style" onSubmit={handleSubmit}>
            <div class="form-group">
              <input type="number" class="form-control" name="empId" id="empId" value={formData.empId} aria-describedby="empId" placeholder="Enter Employee ID" onChange={handleChange} />
            </div>
            <div class="btn-style">
              <button class="btn btn-dark" type="submit" >
             Login
                </button>
            </div>
          </form>
        </div>
      </div>
    </div>

  );
}

export default Login;