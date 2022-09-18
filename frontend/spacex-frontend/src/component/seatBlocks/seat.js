import axios from "axios";
import React, { useEffect, useState } from "react";
import "./style.css";

const Seat=(props)=> {
  const [green, setGreen]=useState(false);
  const [red, setRed]=useState(false);
  const {k,oecode,seats,empId}=props;
  useEffect(()=>{
    setGreen(false)
    setRed(false)
 
      //  axios.get(`http://localhost:9091/spaceX/allocateSpace/?${location.state.empId}`).then(res=>{console.log(res.data)})
      axios.get(` http://localhost:9091/spaceX/allocateSpace/{empId}?empId=${empId} `).then((res)=>{
        console.log(res);
        
        res.data.seats.map((value)=>{
      // console.log(value);
      if(value.seatId==k&&value.department!=null){
        if(value.department.departmentOECode==res.data.departmentOECode){
          setGreen(true)
          console.log("true");
        }
        else if(value.department.departmentOECode!=null&&value.department.departmentOECode!=res.data.departmentOECode){
          setRed(true);
        }
      }
    })
  }) 


  },[k])
 
// consol e.log(seats,oecode,"oecode");
  const isBooked=[];
  // data.map((val,key)=>{
  //   console.log(val)

  // })
  const classes = ["div1",green ? "green" : "",red?"red":""].join(" ");
  // console.log("oecode&seats",oecode,seats);
    return (
      <div >
         <div className={classes} >
          <span class="tooltiptext">{k}</span>
         </div>
      </div>
      
    );
  }

  export default Seat;