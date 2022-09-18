import React from "react";
import Seat from "./seat";
import "./style.css";
const Seats = (props) => {
  const {floor,wing,oecode,seats,empId}=props;

  const rows = [];
  for (let i = 0; i < 40; i++) {
    const id=i+1;
    
    rows.push(<Seat k={'L'+floor+'-'+wing+'-'+id} oecode={oecode} seats={seats} empId={empId}/>);
  }
  return (
    <div style={{position:'relative'}}>
      <div style={{ position: 'absolute', fontSize: '200px', fontWeight: 900, left:'250px',top:'-60px',opacity:'16%',bottom:0,color:'navy' }}>{wing}</div>
      {rows}
    </div>);
}
export default Seats;

