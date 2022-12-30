import {createRouter, createWebHistory} from 'vue-router';
import viewRoutes from '@/routes/view'
import chatRoutes from '@/routes/chat'
import userRoutes from '@/routes/user'


const routes = [
  {
    path: '/',
    redirect: '/view'
  },
  {
    name: 'view',
    path: '/view',
    children: [...viewRoutes]
  },
  {
    name: 'chat',
    path: '/chat',
    children: [...chatRoutes]
  },
  {
    name: 'user',
    path: '/user',
    children: [...userRoutes]
  },
  {
    name: 'unknown',
    path: '/404',
    component: () => import('@/components/UnknownPage')
  },
  {
    path: '/:pathMatch(.*)*',
    redirect: '/404'
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router