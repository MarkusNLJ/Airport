const airplanes = [
    {id: 1, status: false, timeArrival: 8, timeDeparture: 12, planeSize:"m"},
    {id: 2, status: false, timeArrival: 9, timeDeparture: 13, planeSize:"s"},
    {id: 3, status: true, timeArrival: 7, timeDeparture: 12, planeSize:"l"},
    {id: 4, status: false, timeArrival: 13, timeDeparture: 17, planeSize:"l"}
]

function createRows(list){
    const rows = list.map(n =>`
        <tr>
            <td>${n.id}</td>
            <td>${n.status}</td>
            <td>${n.timeArrival}</td>
            <td>${n.timeDeparture}</td>
            <td>${n.planeSize}</td>
        </tr>
        `)
    document.getElementById("in-air").innerHTML = rows.join("")
}

createRows(airplanes)