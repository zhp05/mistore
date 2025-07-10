<<<<<<< HEAD
=======

>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

const routes = [

  {
    path: '/',
    name: 'Home',
<<<<<<< HEAD
    component: () => import('../views/Home.vue')
=======
    component: () => import('../../../../44/mistore/src/views/Home.vue')
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
  },
  {
    path: '/error',
    name: 'Error',
    component: () => import('../components/Error.vue')
  },
  {
    path: '/goods',
    name: 'Goods',
<<<<<<< HEAD
    component: () => import('../views/Goods.vue')
=======
    component: () => import('../../../../44/mistore/src/views/Goods.vue')
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
  },
  {
    path: '/about',
    name: 'About',
<<<<<<< HEAD
    component: () => import('../views/About.vue')
=======
    component: () => import('../../../../44/mistore/src/views/About.vue')
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
  },
  {
    path: '/goods/details',
    name: 'Details',
<<<<<<< HEAD
    component: () => import('../views/Details.vue')
=======
    component: () => import('../../../../44/mistore/src/views/Details.vue')
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
  },
  {
    path: '/seckill/details',
    name: 'SecKillDetails',
<<<<<<< HEAD
    component: () => import('../views/SecKill.vue')
=======
    component: () => import('../../../../44/mistore/src/views/SecKill.vue')
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
  },
  {
    path: '/shoppingCart',
    name: 'ShoppingCart',
<<<<<<< HEAD
    component: () => import('../views/ShoppingCart.vue'),
=======
    component: () => import('../../../../44/mistore/src/views/ShoppingCart.vue'),
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
    meta: {
      requireAuth: true // 需要验证登录状态
    }
  },
  {
    path: '/collect',
    name: 'Collect',
<<<<<<< HEAD
    component: () => import('../views/Collect.vue'),
=======
    component: () => import('../../../../44/mistore/src/views/Collect.vue'),
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
    meta: {
      requireAuth: true // 需要验证登录状态
    }
  },
  {
    path: '/order',
    name: 'Order',
<<<<<<< HEAD
    component: () => import('../views/Order.vue'),
=======
    component: () => import('../../../../44/mistore/src/views/Order.vue'),
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
    meta: {
      requireAuth: true // 需要验证登录状态
    }
  },
  {
    path: '/confirmOrder',
    name: 'ConfirmOrder',
<<<<<<< HEAD
    component: () => import('../views/ConfirmOrder.vue'),
=======
    component: () => import('../../../../44/mistore/src/views/ConfirmOrder.vue'),
>>>>>>> 7c0b2ff90b45b007493ba176911c5639a78ad750
    meta: {
      requireAuth: true // 需要验证登录状态
    }
  }
]

const router = new Router({
   base: '/',
   mode: 'hash',
  routes
})

/* 由于Vue-router在3.1之后把$router.push()方法改为了Promise。所以假如没有回调函数，错误信息就会交给全局的路由错误处理。
vue-router先报了一个Uncaught(in promise)的错误(因为push没加回调) ，然后再点击路由的时候才会触发NavigationDuplicated的错误(路由出现的错误，全局错误处理打印了出来)。*/
// 禁止全局路由错误处理打印
const originalPush = Router.prototype.push;
Router.prototype.push = function push (location, onResolve, onReject) {
  if (onResolve || onReject)
    return originalPush.call(this, location, onResolve, onReject)
  return originalPush.call(this, location).catch(err => err)
}

export default router
