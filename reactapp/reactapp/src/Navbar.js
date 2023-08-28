import { Link, Outlet } from 'react-router-dom';
import './App.css'
//import { useEffect, useState } from 'react';

export default function Navbar(){

  //let [nav,setNav] = useState({});
  let user = localStorage.getItem("UserSession")
  //  useEffect(()=>{
  //   user = localStorage.getItem("UserSession")
  //   if(user!=null){
  //     setNav(user)
  //   }
  //   else{
  //     setNav(null)
  //   }
      
  //   },[{...user}])
   



    return(
        <>
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
        <Link className="navbar-brand" to='/'>E-Tender APP</Link>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link className="nav-link" to='/Search'>Search</Link>
            </li>
            {user==null ? <li className="nav-item">
              <Link className="nav-link" to='/Login'>Login</Link>
            </li> : <></>}
            {user!=null ? <li className="nav-item">
              <Link className="nav-link" to='/Logout'>Logout</Link>
            </li> : <></>}
            {user==null ? <li className="nav-item">
              <Link className="nav-link" to='/Register'>Sign Up</Link>
            </li>: <></>}
            {user!=null ? <li className="nav-item">
              <Link className="nav-link" to='/UserDetails'>User Details</Link>
            </li>:<></>}
            {user!=null ? <li className="nav-item">
              <Link className="nav-link" to='/TenderSubmit'>Add Tender</Link>
            </li>:<></>}
            <li className="nav-item">
              <Link className="nav-link" to='/AboutUs'>About Us</Link>
            </li>
            {/* <li className="nav-item">
              <Link className="nav-link" to='/ContactUs'>Contact Us</Link>
            </li> */}

            {/* Copy for testing, comment when done */}
            {/* <li className="nav-item">
              <Link className="nav-link" to='/UserDetails'>User Details</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to='/TenderSubmit'>Add Tender</Link>
            </li> */}
            
          </ul>
          
        </div>
      </nav>
      <Outlet></Outlet>
    </>
    )
}

