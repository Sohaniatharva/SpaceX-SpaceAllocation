import React from "react";
import Seat from "./seat";
import "./style.css";
const Seats=()=> {
  const rows = [];
  for (let i = 0; i < 40; i++) {
      rows.push(<Seat />);
  }
  return (
    <div>
      {rows}
    </div>);
  }
  
  export default Seats;