import DropdownButton from 'react-bootstrap/DropdownButton';
import Dropdown from 'react-bootstrap/Dropdown'
import React, { useState } from "react";
import { useLocation } from "react-router-dom";
import { Form } from 'react-bootstrap';
import "./styles.css"
import Seats from '../seatBlocks/seats';
const AVP = () => {
  const location = useLocation();
  const[floor,setFloor]=useState(0);
  const handleSelect=(e)=>{
    setFloor(e)
  }

  return (
    <div class="outer-div">
      <div class="upr-div row" >
        <div class="col-lg-8">
          <img style={{ height: "60px", marginLeft: "8px" }} src="http://www.fundraiso.ch/wp-content/uploads/2021/02/CS-Logo-1-scaled.jpg"></img>
        </div>
        <div class="col-lg-4 username">
          <p>Hello {location.state}</p>
        </div>


      </div>
      <div>
        <div class="row dropDownRow">
          <div className="col-lg-6">
        <div  class="dropDownBtn" >
      <DropdownButton variant='info'
      title={floor==0?'  Floor   ':'  Floor '+floor+' '}
      onSelect={handleSelect}>
        <Dropdown.Item eventKey="1" >Floor 1</Dropdown.Item>
        <Dropdown.Item eventKey="2">Floor 2</Dropdown.Item>
        <Dropdown.Item eventKey="3">Floor 3</Dropdown.Item>
      </DropdownButton>
    
          </div>
          </div> 
          <div className='col-lg-6'>
            <div class="row box-style">
              <div class="col-lg-3" style={{margin:'0 2px 2px'}}>
                <div className="row">
                    <div className="col-md-12" style={{backgroundColor:'navy',padding:'10px,5px',color:'white',padding:'4px'}}>
                        <Form.Group controlId="startDate">
                            <Form.Label>Start Date</Form.Label>
                            <Form.Control type="date" name="startDate" placeholder="Start Date" />
                        </Form.Group>
                    </div>
                </div>
                </div>
                <div class="col-lg-3" style={{margin:'0 2px'}}>
                <div className="row">
                    <div className="col-md-12" style={{backgroundColor:'navy',padding:'10px,5px',color:'white',padding:'4px'}}>
                        <Form.Group controlId="endDate">
                            <Form.Label>End Date</Form.Label>
                            <Form.Control type="date" name="endDate" placeholder="End Date" />
                        </Form.Group>
                    </div>
                </div>
                </div>
                </div>
           

          </div>
          
        </div>

      </div>
      <div class="seatBox">
        <div class="row" >
          <div class="col=lg-6" style={{width:"50%"}}>
            <Seats></Seats>
          </div>
          <div class="col=lg-6" style={{width:"50%", float:"left"}}>
            <Seats></Seats>
          </div>

        </div>
        <br></br>
        <div class="row">
          <div class="col=lg-6" style={{width:"50%"}}>
            <Seats></Seats>
          </div>
          <div class="col=lg-6" style={{width:"50%", float:"left"}}>
            <Seats></Seats>
          </div>

        </div>

      </div>
      <div style={{textAlign:'center', padding:'8px 0'}}>
      <button class="btn bookBtn" style={{backgroundColor:'navy',color:'white'}}>Book Seat</button>
      </div>
    </div>

  );
}

export default AVP;