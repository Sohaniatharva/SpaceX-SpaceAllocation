import React, { useEffect, useState } from "react";
import "./style.css";

const Seat=(props)=> {
  const [green, setGreen]=useState(false);
  const [red, setRed]=useState(false);
  const {k,oecode,seats}=props;
  useEffect(()=>{
    setGreen(false)
    setRed(false)
    seats.map((value)=>{
      console.log(value);
      if(value.seatId==k&&value.department!=null){
        if(value.department.departmentOECode==oecode){
          setGreen(true)
          console.log("true");
        }
        else if(value.department.departmentOECode!=null&&value.department.departmentOECode!=oecode){
          setRed(true);
        }
      }
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