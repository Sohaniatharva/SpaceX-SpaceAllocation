import React from "react";
import Seat from "./seat";
import "./style.css";
const Seats = (props) => {
  const rows = [];
  for (let i = 0; i < 40; i++) {
    rows.push(<Seat />);
  }
  return (
    <div style={{position:'relative'}}>
      <div style={{ position: 'absolute', fontSize: '200px', fontWeight: 900, left:'250px',top:'-60px',opacity:'16%',bottom:0,color:'navy' }}>{props.wing}</div>
      {rows}
    </div>);
}
export default Seats;

