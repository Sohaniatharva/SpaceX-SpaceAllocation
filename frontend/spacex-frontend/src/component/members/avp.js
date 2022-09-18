import React from "react";
import { useParams } from "react-router-dom";
import "./styles.css"
const AVP=()=> {
  const {location} = useParams(); 
 console.log(location); 
  
  return (
    <div class="outer-div">
       <div class="upr-div">
        <img style={{height:"60px",marginLeft:"8px"}} src="http://www.fundraiso.ch/wp-content/uploads/2021/02/CS-Logo-1-scaled.jpg"></img>

       </div>
    </div>
    
  );
}

export default AVP;