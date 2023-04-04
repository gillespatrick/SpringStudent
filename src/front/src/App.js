import './App.css';
import {getAllStudents} from './client';
import {useState,useEffect} from 'react';

function App() {
    const [students, setStudents] = useState([]);
    const fetchStudents = () =>
        getAllStudents()
            .then(res => res.json())
            .then(data => {
                console.log(data)
                setStudents(data)
            })

    useEffect( () => {
        console.log("Component is mounted");
        fetchStudents()
    }, []);

    if(students <=0){
        return "No Data"
    }


    return students.map((student, index) => {
       return  <p key={index}>{student.id}- {student.name} </p>
    })
}

export default App;
